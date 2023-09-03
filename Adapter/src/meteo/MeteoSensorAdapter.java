package meteo;

import java.time.LocalDateTime;

public class MeteoSensorAdapter implements MeteoSensor{

    private ST500Info st500 = new ST500Info();

    @Override
    public int getId() {
        return 2;
    }

    @Override
    public Float getTemperature() {
        return (float) st500.getData().temperature();
    }

    @Override
    public Float getHumidity() {
        return (float) 0;
    }

    @Override
    public Float getPressure() {
        return (float) 0;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
    
}
