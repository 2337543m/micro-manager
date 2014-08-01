package org.micromanager.api.data;

import java.awt.Color;

import org.json.JSONObject;

import org.micromanager.api.MultiStagePosition;

/**
 * This class defines the parameters that control how a given dataset is
 * displayed.
 * It is immutable; construct it with a DisplaySettingsBuilder.
 */
public interface DisplaySettings {

   interface DisplaySettingsBuilder {
      /**
       * Construct a DisplaySettings from the DisplaySettingsBuilder. Call 
       * this once you are finished setting all DisplaySettings parameters.
       */
      DisplaySettings build();

      // The following functions each set the relevant value for the 
      // DisplaySettings.
      DisplaySettingsBuilder channelNames(String[] channelNames);
      DisplaySettingsBuilder channelColors(Color[] channelColors);
      DisplaySettingsBuilder channelContrastMins(Integer[] channelContrastMins);
      DisplaySettingsBuilder channelContrastMaxes(Integer[] channelContrastMaxes);
      DisplaySettingsBuilder isSlowHistogramsOn(Boolean isSlowHistogramsOn);
      DisplaySettingsBuilder shouldSyncChannels(Boolean shouldSyncChannels);
      DisplaySettingsBuilder scaleBarColorIndex(Integer scaleBarColorIndex);
      DisplaySettingsBuilder scaleBarLocationIndex(Integer scaleBarLocationIndex);
      DisplaySettingsBuilder shouldShowScaleBar(Boolean shouldShowScaleBar);
      DisplaySettingsBuilder shouldAutostretch(Boolean shouldAutostretch);
      DisplaySettingsBuilder shouldIgnoreOutliers(Boolean shouldIgnoreOutliers);
      DisplaySettingsBuilder percentToIgnore(Double percentToIgnore);
      DisplaySettingsBuilder shouldUseLogScale(Boolean shouldUseLogScale);
   }

   /**
    * Generate a new DisplaySettingsBuilder whose values are initialized to be
    * the values of this DisplaySettings.
    */
   DisplaySettingsBuilder copy();

   public String[] getChannelNames();
   public Color[] getChannelColors();
   public Integer[] getChannelContrastMins();
   public Integer[] getChannelContrastMaxes();
   public Boolean getIsSlowHistogramsOn();
   public Boolean getShouldSyncChannels();
   public Integer getScaleBarColorIndex();
   public Integer getScaleBarLocationIndex();
   public Boolean getShouldShowScaleBar();
   public Boolean getShouldAutostretch();
   public Boolean getShouldIgnoreOutliers();
   public Double getPercentToIgnore();
   public Boolean getShouldUseLogScale();
   /**
    * For legacy support only: convert to JSONObject.
    */
   public JSONObject legacyToJSON();
}
