/*
 * This file is generated by jOOQ.
 */
package com.nthalk.healthtracker.db.models.tables.records;


import com.nthalk.healthtracker.db.models.tables.UserCheckin;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCheckinRecord extends UpdatableRecordImpl<UserCheckinRecord> implements Record13<Long, Long, OffsetDateTime, Double, Double, Double, Float, String, OffsetDateTime, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -326294702;

    /**
     * Setter for <code>user_checkin.checkin_id</code>.
     */
    public void setCheckinId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_checkin.checkin_id</code>.
     */
    public Long getCheckinId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>user_checkin.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_checkin.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>user_checkin.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>user_checkin.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>user_checkin.gps_latitude</code>.
     */
    public void setGpsLatitude(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>user_checkin.gps_latitude</code>.
     */
    public Double getGpsLatitude() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>user_checkin.gps_longitude</code>.
     */
    public void setGpsLongitude(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>user_checkin.gps_longitude</code>.
     */
    public Double getGpsLongitude() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>user_checkin.gps_accuracy</code>.
     */
    public void setGpsAccuracy(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>user_checkin.gps_accuracy</code>.
     */
    public Double getGpsAccuracy() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>user_checkin.temperature</code>.
     */
    public void setTemperature(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>user_checkin.temperature</code>.
     */
    public Float getTemperature() {
        return (Float) get(6);
    }

    /**
     * Setter for <code>user_checkin.temperature_unit</code>.
     */
    public void setTemperatureUnit(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>user_checkin.temperature_unit</code>.
     */
    public String getTemperatureUnit() {
        return (String) get(7);
    }

    /**
     * Setter for <code>user_checkin.fever_start_at</code>.
     */
    public void setFeverStartAt(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>user_checkin.fever_start_at</code>.
     */
    public OffsetDateTime getFeverStartAt() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>user_checkin.sore_throat_scale</code>.
     */
    public void setSoreThroatScale(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>user_checkin.sore_throat_scale</code>.
     */
    public Integer getSoreThroatScale() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>user_checkin.congestion_scale</code>.
     */
    public void setCongestionScale(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>user_checkin.congestion_scale</code>.
     */
    public Integer getCongestionScale() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>user_checkin.cold_sweats_scale</code>.
     */
    public void setColdSweatsScale(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>user_checkin.cold_sweats_scale</code>.
     */
    public Integer getColdSweatsScale() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>user_checkin.sensitive_skin_scale</code>.
     */
    public void setSensitiveSkinScale(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>user_checkin.sensitive_skin_scale</code>.
     */
    public Integer getSensitiveSkinScale() {
        return (Integer) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, OffsetDateTime, Double, Double, Double, Float, String, OffsetDateTime, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Long, OffsetDateTime, Double, Double, Double, Float, String, OffsetDateTime, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserCheckin.USER_CHECKIN.CHECKIN_ID;
    }

    @Override
    public Field<Long> field2() {
        return UserCheckin.USER_CHECKIN.USER_ID;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return UserCheckin.USER_CHECKIN.CREATED_AT;
    }

    @Override
    public Field<Double> field4() {
        return UserCheckin.USER_CHECKIN.GPS_LATITUDE;
    }

    @Override
    public Field<Double> field5() {
        return UserCheckin.USER_CHECKIN.GPS_LONGITUDE;
    }

    @Override
    public Field<Double> field6() {
        return UserCheckin.USER_CHECKIN.GPS_ACCURACY;
    }

    @Override
    public Field<Float> field7() {
        return UserCheckin.USER_CHECKIN.TEMPERATURE;
    }

    @Override
    public Field<String> field8() {
        return UserCheckin.USER_CHECKIN.TEMPERATURE_UNIT;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return UserCheckin.USER_CHECKIN.FEVER_START_AT;
    }

    @Override
    public Field<Integer> field10() {
        return UserCheckin.USER_CHECKIN.SORE_THROAT_SCALE;
    }

    @Override
    public Field<Integer> field11() {
        return UserCheckin.USER_CHECKIN.CONGESTION_SCALE;
    }

    @Override
    public Field<Integer> field12() {
        return UserCheckin.USER_CHECKIN.COLD_SWEATS_SCALE;
    }

    @Override
    public Field<Integer> field13() {
        return UserCheckin.USER_CHECKIN.SENSITIVE_SKIN_SCALE;
    }

    @Override
    public Long component1() {
        return getCheckinId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public OffsetDateTime component3() {
        return getCreatedAt();
    }

    @Override
    public Double component4() {
        return getGpsLatitude();
    }

    @Override
    public Double component5() {
        return getGpsLongitude();
    }

    @Override
    public Double component6() {
        return getGpsAccuracy();
    }

    @Override
    public Float component7() {
        return getTemperature();
    }

    @Override
    public String component8() {
        return getTemperatureUnit();
    }

    @Override
    public OffsetDateTime component9() {
        return getFeverStartAt();
    }

    @Override
    public Integer component10() {
        return getSoreThroatScale();
    }

    @Override
    public Integer component11() {
        return getCongestionScale();
    }

    @Override
    public Integer component12() {
        return getColdSweatsScale();
    }

    @Override
    public Integer component13() {
        return getSensitiveSkinScale();
    }

    @Override
    public Long value1() {
        return getCheckinId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public OffsetDateTime value3() {
        return getCreatedAt();
    }

    @Override
    public Double value4() {
        return getGpsLatitude();
    }

    @Override
    public Double value5() {
        return getGpsLongitude();
    }

    @Override
    public Double value6() {
        return getGpsAccuracy();
    }

    @Override
    public Float value7() {
        return getTemperature();
    }

    @Override
    public String value8() {
        return getTemperatureUnit();
    }

    @Override
    public OffsetDateTime value9() {
        return getFeverStartAt();
    }

    @Override
    public Integer value10() {
        return getSoreThroatScale();
    }

    @Override
    public Integer value11() {
        return getCongestionScale();
    }

    @Override
    public Integer value12() {
        return getColdSweatsScale();
    }

    @Override
    public Integer value13() {
        return getSensitiveSkinScale();
    }

    @Override
    public UserCheckinRecord value1(Long value) {
        setCheckinId(value);
        return this;
    }

    @Override
    public UserCheckinRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserCheckinRecord value3(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public UserCheckinRecord value4(Double value) {
        setGpsLatitude(value);
        return this;
    }

    @Override
    public UserCheckinRecord value5(Double value) {
        setGpsLongitude(value);
        return this;
    }

    @Override
    public UserCheckinRecord value6(Double value) {
        setGpsAccuracy(value);
        return this;
    }

    @Override
    public UserCheckinRecord value7(Float value) {
        setTemperature(value);
        return this;
    }

    @Override
    public UserCheckinRecord value8(String value) {
        setTemperatureUnit(value);
        return this;
    }

    @Override
    public UserCheckinRecord value9(OffsetDateTime value) {
        setFeverStartAt(value);
        return this;
    }

    @Override
    public UserCheckinRecord value10(Integer value) {
        setSoreThroatScale(value);
        return this;
    }

    @Override
    public UserCheckinRecord value11(Integer value) {
        setCongestionScale(value);
        return this;
    }

    @Override
    public UserCheckinRecord value12(Integer value) {
        setColdSweatsScale(value);
        return this;
    }

    @Override
    public UserCheckinRecord value13(Integer value) {
        setSensitiveSkinScale(value);
        return this;
    }

    @Override
    public UserCheckinRecord values(Long value1, Long value2, OffsetDateTime value3, Double value4, Double value5, Double value6, Float value7, String value8, OffsetDateTime value9, Integer value10, Integer value11, Integer value12, Integer value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserCheckinRecord
     */
    public UserCheckinRecord() {
        super(UserCheckin.USER_CHECKIN);
    }

    /**
     * Create a detached, initialised UserCheckinRecord
     */
    public UserCheckinRecord(Long checkinId, Long userId, OffsetDateTime createdAt, Double gpsLatitude, Double gpsLongitude, Double gpsAccuracy, Float temperature, String temperatureUnit, OffsetDateTime feverStartAt, Integer soreThroatScale, Integer congestionScale, Integer coldSweatsScale, Integer sensitiveSkinScale) {
        super(UserCheckin.USER_CHECKIN);

        set(0, checkinId);
        set(1, userId);
        set(2, createdAt);
        set(3, gpsLatitude);
        set(4, gpsLongitude);
        set(5, gpsAccuracy);
        set(6, temperature);
        set(7, temperatureUnit);
        set(8, feverStartAt);
        set(9, soreThroatScale);
        set(10, congestionScale);
        set(11, coldSweatsScale);
        set(12, sensitiveSkinScale);
    }
}
