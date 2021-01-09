// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.JsonFlatten;
import com.azure.search.documents.indexes.models.OutputFieldMappingEntry;
import com.azure.search.documents.indexes.models.SplitSkillLanguage;
import com.azure.search.documents.indexes.models.TextSplitMode;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;
import java.util.List;

/** A skill to split a string into chunks of text. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Skills.Text.SplitSkill")
@JsonFlatten
@Fluent
public class SplitSkill extends SearchIndexerSkill {
    /*
     * A value indicating which language code to use. Default is en.
     */
    @SerdeProperty(value = "defaultLanguageCode")
    private SplitSkillLanguage defaultLanguageCode;

    /*
     * A value indicating which split mode to perform.
     */
    @SerdeProperty(value = "textSplitMode")
    private TextSplitMode textSplitMode;

    /*
     * The desired maximum page length. Default is 10000.
     */
    @SerdeProperty(value = "maximumPageLength")
    private Integer maximumPageLength;

    /**
     * Creates an instance of SplitSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @SerdeToPojo
    public SplitSkill(
            @SerdeProperty(value = "inputs") List<InputFieldMappingEntry> inputs,
            @SerdeProperty(value = "outputs") List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public SplitSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setDefaultLanguageCode(SplitSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the textSplitMode property: A value indicating which split mode to perform.
     *
     * @return the textSplitMode value.
     */
    public TextSplitMode getTextSplitMode() {
        return this.textSplitMode;
    }

    /**
     * Set the textSplitMode property: A value indicating which split mode to perform.
     *
     * @param textSplitMode the textSplitMode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setTextSplitMode(TextSplitMode textSplitMode) {
        this.textSplitMode = textSplitMode;
        return this;
    }

    /**
     * Get the maximumPageLength property: The desired maximum page length. Default is 10000.
     *
     * @return the maximumPageLength value.
     */
    public Integer getMaximumPageLength() {
        return this.maximumPageLength;
    }

    /**
     * Set the maximumPageLength property: The desired maximum page length. Default is 10000.
     *
     * @param maximumPageLength the maximumPageLength value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setMaximumPageLength(Integer maximumPageLength) {
        this.maximumPageLength = maximumPageLength;
        return this;
    }
}