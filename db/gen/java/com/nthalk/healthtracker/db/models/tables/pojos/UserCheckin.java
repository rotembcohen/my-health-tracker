/*
 * This file is generated by jOOQ.
 */
package com.nthalk.healthtracker.db.models.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCheckin implements Serializable {

    private static final long serialVersionUID = -1175263258;

    private Long           checkinId;
    private Long           userId;
    private OffsetDateTime createdAt;
    private Double         gpsLatitude;
    private Double         gpsLongitude;
    private Double         gpsAccuracy;
    private Float          temperature;
    private String         temperatureUnit;
    private OffsetDateTime feverStartAt;
    private Integer        soreThroatScale;
    private Integer        congestionScale;
    private Integer        coldSweatsScale;
    private Integer        sensitiveSkinScale;

    public UserCheckin() {}

    public UserCheckin(UserCheckin value) {
        this.checkinId = value.checkinId;
        this.userId = value.userId;
        this.createdAt = value.createdAt;
        this.gpsLatitude = value.gpsLatitude;
        this.gpsLongitude = value.gpsLongitude;
        this.gpsAccuracy = value.gpsAccuracy;
        this.temperature = value.temperature;
        this.temperatureUnit = value.temperatureUnit;
        this.feverStartAt = value.feverStartAt;
        this.soreThroatScale = value.soreThroatScale;
        this.congestionScale = value.congestionScale;
        this.coldSweatsScale = value.coldSweatsScale;
        this.sensitiveSkinScale = value.sensitiveSkinScale;
    }

    public UserCheckin(
        Long           checkinId,
        Long           userId,
        OffsetDateTime createdAt,
        Double         gpsLatitude,
        Double         gpsLongitude,
        Double         gpsAccuracy,
        Float          temperature,
        String         temperatureUnit,
        OffsetDateTime feverStartAt,
        Integer        soreThroatScale,
        Integer        congestionScale,
        Integer        coldSweatsScale,
        Integer        sensitiveSkinScale
    ) {
        this.checkinId = checkinId;
        this.userId = userId;
        this.createdAt = createdAt;
        this.gpsLatitude = gpsLatitude;
        this.gpsLongitude = gpsLongitude;
        this.gpsAccuracy = gpsAccuracy;
        this.temperature = temperature;
        this.temperatureUnit = temperatureUnit;
        this.feverStartAt = feverStartAt;
        this.soreThroatScale = soreThroatScale;
        this.congestionScale = congestionScale;
        this.coldSweatsScale = coldSweatsScale;
        this.sensitiveSkinScale = sensitiveSkinScale;
    }

    public Long getCheckinId() {
        return this.checkinId;
    }

    public void setCheckinId(Long checkinId) {
        this.checkinId = checkinId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Double getGpsLatitude() {
        return this.gpsLatitude;
    }

    public void setGpsLatitude(Double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public Double getGpsLongitude() {
        return this.gpsLongitude;
    }

    public void setGpsLongitude(Double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public Double getGpsAccuracy() {
        return this.gpsAccuracy;
    }

    public void setGpsAccuracy(Double gpsAccuracy) {
        this.gpsAccuracy = gpsAccuracy;
    }

    public Float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureUnit() {
        return this.temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public OffsetDateTime getFeverStartAt() {
        return this.feverStartAt;
    }

    public void setFeverStartAt(OffsetDateTime feverStartAt) {
        this.feverStartAt = feverStartAt;
    }

    public Integer getSoreThroatScale() {
        return this.soreThroatScale;
    }

    public void setSoreThroatScale(Integer soreThroatScale) {
        this.soreThroatScale = soreThroatScale;
    }

    public Integer getCongestionScale() {
        return this.congestionScale;
    }

    public void setCongestionScale(Integer congestionScale) {
        this.congestionScale = congestionScale;
    }

    public Integer getColdSweatsScale() {
        return this.coldSweatsScale;
    }

    public void setColdSweatsScale(Integer coldSweatsScale) {
        this.coldSweatsScale = coldSweatsScale;
    }

    public Integer getSensitiveSkinScale() {
        return this.sensitiveSkinScale;
    }

    public void setSensitiveSkinScale(Integer sensitiveSkinScale) {
        this.sensitiveSkinScale = sensitiveSkinScale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserCheckin (");

        sb.append(checkinId);
        sb.append(", ").append(userId);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(gpsLatitude);
        sb.append(", ").append(gpsLongitude);
        sb.append(", ").append(gpsAccuracy);
        sb.append(", ").append(temperature);
        sb.append(", ").append(temperatureUnit);
        sb.append(", ").append(feverStartAt);
        sb.append(", ").append(soreThroatScale);
        sb.append(", ").append(congestionScale);
        sb.append(", ").append(coldSweatsScale);
        sb.append(", ").append(sensitiveSkinScale);

        sb.append(")");
        return sb.toString();
    }
}
