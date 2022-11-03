# Building and running

    $ cd hadoop/batch-import
    $ mvn clean package appassembler:assemble

# Start the database (from a separate command window - use 'Ctrl-c' to stop database)

    $ sh ./target/appassembler/bin/start-database

View the products in the PRODUCT table using the web UI

    Driver Class:	org.h2.Driver
    JDBC URL:		jdbc:h2:mem:sbia_ch02
    User Name:		SA
    Password:

# Create the import directory

    $ hadoop fs -mkdir /import/data/products

# Run the import job

    $ sh ./target/appassembler/bin/import

To view the imported product database

    $ hadoop fs -ls /import/data/products
    $ hadoop fs -cat /import/data/products/product-0.txt
# Map the data under /import/data/products into a hive table (other users need to have read permissions)
#### 这里是一个目录为单位，无分区的情况下，直接以products为一个整体下面的文件。分区情况也就是对文件夹进行模糊匹配。
    $ -rw-r--r--  3 dell hdfs  655 2022-11-01 18:03 /import/data/products/product-33.txt
#### 刚开始在hive内建立外部表时，就需要把文件权限改下，该权限的时候，需要先切换用户，然后在修改权限
    $ su hdfs
    $ sudo hadoop fs -chmod -R 777 /import/data/products/
#### "EXTERNAL" 是外部表的关键字，后面的属性需要一一对应。
# ROW FORMAT should have delimiters used to terminate the fields and lines like in the above example the fields are terminated with comma (“,”). 
# The default location of Hive table is overwritten by using LOCATION.
    $ CREATE EXTERNAL TABLE IF NOT EXISTS test_product(id string,name string,description string, price double) ROW format delimited fields terminated BY ',' LOCATION '/import/data/products/';

    # CREATE EXTERNAL TABLE IF NOT EXISTS test_products(id STRING,theme_name string,sql_name STRING, sql_description STRING) PARTITIONED BY (dt STRING) ROW format delimited fields terminated BY ',' LOCATION '/import/data/hive/log/';
#### 因为我们是先把数据导入到hdfs 然后进行在建表，这个时候数据还在hdfs 没有进行自动映射，在第一次映射的时候我们需要修复一次hive表。
    $ Msck repair table <db_name>.<table_name>
    $ Msck repair table test.test_product;
# So the data now is stored in /import/data/products/ folder inside hive.

# Drop table
### On dropping the external table, the data does not get deleted from HDFS. Thus, it is evident that the external table are just pointers on HDFS data. Table can be dropped using:

    $ DROP TABLE weather;


