package org.traccar.model;

import org.traccar.storage.StorageName;

@StorageName("tc_position_data")
public class PositionData extends ExtendedModel {

    private String address;
    private long positionId;
    private long deviceId;


    public long getPositionId() {
        return positionId;
    }
    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public long getDeviceId() {
        return  deviceId;
    }
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }
}
