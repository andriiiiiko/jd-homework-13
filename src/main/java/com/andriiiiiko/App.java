package com.andriiiiiko;

import com.andriiiiiko.database.utils.FlywayMigration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("The program has started");

        FlywayMigration.migrateDatabase();

        LOG.info("The program has finished");
    }
}
