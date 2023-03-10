/**
 *  Withings Activity Tracker
 *
 *  Copyright 2020 Dominick Meglio
 *  Copyright 2022 @lnjustin
 *  Licensed under the BSD 3-Clause License
 *
 *  Change History:
 *  All Changes documented in Withings_User.groovy
 */

metadata {
    definition(name: "Withings Activity Tracker", namespace: "lnjustin", author: "dmeglio@gmail.com, lnjustin") {
        capability "Sensor"
		capability "Battery"
        capability "StepSensor"

        attribute "distance", "number"
        attribute "elevation", "number"
        attribute "soft", "number"
        attribute "moderate", "number"
        attribute "intense", "number"
        attribute "active", "number"
        attribute "calories", "number"
        attribute "totalCalories", "number"
        attribute "heartRateAverage", "number"
        attribute "heartRateMin", "number"
        attribute "heartRateMax", "number"
        attribute "heartRateZone0", "number"
        attribute "heartRateZone1", "number"
        attribute "heartRateZone2", "number"
        attribute "heartRateZone3", "number"

        attribute "wakeupDuration", "number"
        attribute "wakeupDurationDisplay", "string"
        attribute "lightSleepDuration", "number"
        attribute "lightSleepDurationDisplay", "string"
        attribute "deepSleepDuration", "number"
        attribute "deepSleepDurationDisplay", "string"
        attribute "wakeupCount", "number"
        attribute "durationToSleep", "number"
        attribute "durationToWakeup", "number"
        attribute "durationToWakeupDisplay", "string"
        attribute "heartRateAverage", "number"
        attribute "heartRateMin", "number"
        attribute "heartRateMax", "number"
        attribute "respirationRateAverage", "number"
        attribute "respirationRateMin", "number"
        attribute "respirationRateMax", "number"
        attribute "breathingDisturbancesIntensity", "number"
        attribute "snoring", "number"
        attribute "snoringDisplay", "string"
        attribute "snoringEpisodeCount", "number"
        attribute "sleepScore", "number"
    }
}
