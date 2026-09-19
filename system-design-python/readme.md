```
API 1 ─┐
       ├──> Landing
API 2 ─┘
          ↓
       Bronze L1
          ↓
   Reconciliation ↔ Audit/Metadata
          ↓
       ┌───────┐
       │  OK?  │
       └───┬───┘
       No  │  Yes
       ↓   │   ↓
 Quarantine Archive
                 ↓
             Bronze L2
                 ↓
          Transform + SCD2
                 ↓
              Silver
                 ↓
             DQ Checks
              ↓     ↓
           Pass    Fail
             ↓      ↓
            Gold   Target Team
             ↓      ↓
             └──────┘
                 ↓
             Snowflake
                 ↓
                 BI
```

=> Not exactly the system design of Java, but the pipeline one.