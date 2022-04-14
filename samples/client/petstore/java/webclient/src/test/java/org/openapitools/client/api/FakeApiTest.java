/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.EnumClass;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for FakeApi
 */
@Ignore
public class FakeApiTest {

    private final FakeApi api = new FakeApi();

    
    /**
     * Health check endpoint
     *
     * 
     */
    @Test
    public void fakeHealthGetTest()  {
        HealthCheckResult response = api.fakeHealthGet().block();

        // TODO: test validations
    }
    
    /**
     * test http signature authentication
     *
     * 
     */
    @Test
    public void fakeHttpSignatureTestTest()  {
        Pet pet = null;
        String query1 = null;
        String header1 = null;
        api.fakeHttpSignatureTest(pet, query1, header1).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of outer boolean types
     */
    @Test
    public void fakeOuterBooleanSerializeTest()  {
        Boolean body = null;
        Boolean response = api.fakeOuterBooleanSerialize(body).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of object with outer number type
     */
    @Test
    public void fakeOuterCompositeSerializeTest()  {
        OuterComposite outerComposite = null;
        OuterComposite response = api.fakeOuterCompositeSerialize(outerComposite).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of outer number types
     */
    @Test
    public void fakeOuterNumberSerializeTest()  {
        BigDecimal body = null;
        BigDecimal response = api.fakeOuterNumberSerialize(body).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of outer string types
     */
    @Test
    public void fakeOuterStringSerializeTest()  {
        String body = null;
        String response = api.fakeOuterStringSerialize(body).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of enum (int) properties with examples
     */
    @Test
    public void fakePropertyEnumIntegerSerializeTest()  {
        OuterObjectWithEnumProperty outerObjectWithEnumProperty = null;
        OuterObjectWithEnumProperty response = api.fakePropertyEnumIntegerSerialize(outerObjectWithEnumProperty).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * For this test, the body has to be a binary file.
     */
    @Test
    public void testBodyWithBinaryTest()  {
        File body = null;
        api.testBodyWithBinary(body).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
     */
    @Test
    public void testBodyWithFileSchemaTest()  {
        FileSchemaTestClass fileSchemaTestClass = null;
        api.testBodyWithFileSchema(fileSchemaTestClass).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void testBodyWithQueryParamsTest()  {
        String query = null;
        User user = null;
        api.testBodyWithQueryParams(query, user).block();

        // TODO: test validations
    }
    
    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     */
    @Test
    public void testClientModelTest()  {
        Client client = null;
        Client response = api.testClientModel(client).block();

        // TODO: test validations
    }
    
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     */
    @Test
    public void testEndpointParametersTest()  {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        File binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback).block();

        // TODO: test validations
    }
    
    /**
     * To test enum parameters
     *
     * To test enum parameters
     */
    @Test
    public void testEnumParametersTest()  {
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        List<EnumClass> enumQueryModelArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString).block();

        // TODO: test validations
    }
    
    /**
     * Fake endpoint to test group parameters (optional)
     *
     * Fake endpoint to test group parameters (optional)
     */
    @Test
    public void testGroupParametersTest()  {
        Integer requiredStringGroup = null;
        Boolean requiredBooleanGroup = null;
        Long requiredInt64Group = null;
        Integer stringGroup = null;
        Boolean booleanGroup = null;
        Long int64Group = null;
        api.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group).block();

        // TODO: test validations
    }
    
    /**
     * test inline additionalProperties
     *
     * 
     */
    @Test
    public void testInlineAdditionalPropertiesTest()  {
        Map<String, String> requestBody = null;
        api.testInlineAdditionalProperties(requestBody).block();

        // TODO: test validations
    }
    
    /**
     * test json serialization of form data
     *
     * 
     */
    @Test
    public void testJsonFormDataTest()  {
        String param = null;
        String param2 = null;
        api.testJsonFormData(param, param2).block();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * To test the collection format in query parameters
     */
    @Test
    public void testQueryParameterCollectionFormatTest()  {
        List<String> pipe = null;
        List<String> ioutil = null;
        List<String> http = null;
        List<String> url = null;
        List<String> context = null;
        String allowEmpty = null;
        Map<String, String> language = null;
        api.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context, allowEmpty, language).block();

        // TODO: test validations
    }
    
}
