CREATE TABLE "USER"
(
    USER_ID                  serial8 PRIMARY KEY,
    NORMAL_MIN_TEMPERATURE   float4,
    NORMAL_MAX_TEMPERATURE   float4,
    DEFAULT_TEMPERATURE_UNIT varchar,
    CREATED_AT               timestamptz NOT NULL
);

CREATE TABLE USER_TOKEN
(
    TOKEN      VARCHAR     NOT NULL PRIMARY KEY,
    USER_ID    int8 references "USER" (USER_ID),
    CREATED_AT timestamptz NOT NULL
);

CREATE TABLE USER_CHECKIN
(
    CHECKIN_ID           serial8 primary key,
    USER_ID              int8 references "USER" (USER_ID),
    CREATED_AT           timestamptz NOT NULL,
    GPS_LATITUDE         float8      NOT NULL,
    GPS_LONGITUDE        float8      NOT NULL,
    GPS_ACCURACY         float8      NOT NULL,
    TEMPERATURE          float4      NOT NULL,
    TEMPERATURE_UNIT     varchar     NOT NULL,
    FEVER_START_AT       timestamptz,
    SORE_THROAT_SCALE    int,
    CONGESTION_SCALE     int,
    COLD_SWEATS_SCALE    int,
    SENSITIVE_SKIN_SCALE int
);
