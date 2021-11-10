package ru.geekbrains.core.dima.lesson6.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Data {
    @JsonProperty("Headline")
    public Headline headline;
    @JsonProperty("DailyForecasts")
    public List<DailyForecast> dailyForecasts;

    public static class Headline {
        @JsonProperty("EffectiveDate")
        public Date effectiveDate;
        @JsonProperty("EffectiveEpochDate")
        public int effectiveEpochDate;
        @JsonProperty("Severity")
        public int severity;
        @JsonProperty("Text")
        public String text;
        @JsonProperty("Category")
        public String category;
        @JsonProperty("EndDate")
        public Date endDate;
        @JsonProperty("EndEpochDate")
        public int endEpochDate;
        @JsonProperty("MobileLink")
        public String mobileLink;
        @JsonProperty("Link")
        public String link;
    }

    public static class Minimum {
        @JsonProperty("Value")
        public int value;
        @JsonProperty("Unit")
        public String unit;
        @JsonProperty("UnitType")
        public int unitType;
    }

    public static class Maximum {
        @JsonProperty("Value")
        public int value;
        @JsonProperty("Unit")
        public String unit;
        @JsonProperty("UnitType")
        public int unitType;
    }

    public static class Temperature {
        @JsonProperty("Minimum")
        public Minimum minimum;
        @JsonProperty("Maximum")
        public Maximum maximum;
    }

    public static class Day {
        @JsonProperty("Icon")
        public int icon;
        @JsonProperty("IconPhrase")
        public String iconPhrase;
        @JsonProperty("HasPrecipitation")
        public boolean hasPrecipitation;
        @JsonProperty("PrecipitationType")
        public String precipitationType;
        @JsonProperty("PrecipitationIntensity")
        public String precipitationIntensity;
    }

    public static class Night {
        @JsonProperty("Icon")
        public int icon;
        @JsonProperty("IconPhrase")
        public String iconPhrase;
        @JsonProperty("HasPrecipitation")
        public boolean hasPrecipitation;
        @JsonProperty("PrecipitationType")
        public String precipitationType;
        @JsonProperty("PrecipitationIntensity")
        public String precipitationIntensity;
    }

    public static class DailyForecast {
        @JsonProperty("Date")
        public Date date;
        @JsonProperty("EpochDate")
        public int epochDate;
        @JsonProperty("Temperature")
        public Temperature temperature;
        @JsonProperty("Day")
        public Day day;
        @JsonProperty("Night")
        public Night night;
        @JsonProperty("Sources")
        public List<String> sources;
        @JsonProperty("MobileLink")
        public String mobileLink;
        @JsonProperty("Link")
        public String link;
    }
}


