# Compare two tables with the same schema
val source_df = spark.sql("""select col1, col2, col3 from sourcetable""")
val target_df = spark.sql("""select col1, col2, col3 from targettable""")
source_df.except(target_df).show(100,false)
target_df.except(source_df).show(100,false)
