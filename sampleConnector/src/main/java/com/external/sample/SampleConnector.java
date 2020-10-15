package com.external.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.saviynt.ssm.abstractConnector.BaseConnectorSpecification;
import com.saviynt.ssm.abstractConnector.ConfigDataVo;
import com.saviynt.ssm.abstractConnector.RepositoryReconService;
import com.saviynt.ssm.abstractConnector.SearchableObject;
import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidAttributeValueException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidCredentialException;
import com.saviynt.ssm.abstractConnector.exceptions.MissingKeyException;
import com.saviynt.ssm.abstractConnector.exceptions.OperationTimeoutException;

/**
 * The Class SampleConnector.
 */
public class SampleConnector extends BaseConnectorSpecification
{

	 
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Display name.
	 *
	 * @return the string
	 */
	@Override
	public String displayName() {
	 
		return "SAMPLE";
	}

	/**
	 * Version.
	 *
	 * @return the string
	 */
	@Override
	public String version() {
		 
		return "1.0";
	}

	/**
	 * Test.
	 *
	 * @param configData the config data
	 * @param filterData the filter data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 * @throws InvalidCredentialException the invalid credential exception
	 * @throws InvalidAttributeValueException the invalid attribute value exception
	 * @throws OperationTimeoutException the operation timeout exception
	 * @throws MissingKeyException the missing key exception
	 */
	@Override
	public Boolean test(Map<String, Object> configData, Map<String, Object> filterData) throws ConnectorException,
			InvalidCredentialException, InvalidAttributeValueException, OperationTimeoutException, MissingKeyException {
		//logic to test connection
		return true;
	}

	/**
	 * Reconsile.
	 *
	 * @param configData the config data
	 * @param dataFromEcm the data from ecm
	 * @param formatterClass the formatter class
	 */
	@Override
	public void reconsile(Map<String, Object> configData, Map<String, Object> dataFromEcm, String formatterClass) {
		List<List<Map<String, Object>>> finalData = new ArrayList<List<Map<String, Object>>>();
		List<Map<String, Object>> finalDataList = new ArrayList<Map<String, Object>>();
		JSONObject jsonObject = new JSONObject(dataFromEcm.get("AccountReconJSON").toString());
		Map<String, Object> filterData = jsonObject.toMap();
		System.out.println(filterData);
		finalData.add(finalDataList);
		try {
			RepositoryReconService.notify(finalData, null, formatterClass, dataFromEcm);
		} catch (Exception e) {
			 
		}
		
		 
		
	}

	/**
	 * Check existing.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @param serachableObject the serachable object
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean checkExisting(Map<String, Object> configData, Map<String, Object> data,
			SearchableObject serachableObject) throws ConnectorException {
		 
		Boolean recordFound=false;
		//Connect to target System With Config data 
		//Check in target System 
		//Return 
		return recordFound;
	}

	/**
	 * Creates the account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean createAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		Boolean recordCreated=false;
		//Connect to target System With Config data 
		//Create in target System 
		//Return 
		return recordCreated;
	}

	/**
	 * Account reconcile.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the map
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Map<String, List<Map<String, Object>>> accountReconcile(Map<String, Object> configData,
			Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Update account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Integer updateAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Lock account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean lockAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Disable account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean disableAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Un lock account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean unLockAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Enable account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean enableAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Terminate account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Integer terminateAccount(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Removes the account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Integer removeAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Adds the access to account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Integer addAccessToAccount(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Removes the access to account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Integer removeAccessToAccount(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Change password.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean changePassword(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Creates the user.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean createUser(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Update user.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Integer updateUser(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Update entitlement.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Integer updateEntitlement(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Creates the entitlement.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean createEntitlement(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Validate credentials.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean validateCredentials(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gets the summary.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the summary
	 */
	@Override
	public Map<String, Object> getSummary(Map<String, Object> configData, Map<String, Object> data) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Sets the config.
	 *
	 * @param configData the new config
	 */
	@Override
	public void setConfig(ConfigDataVo configData) {
		// TODO Auto-generated method stub
		
	}
    
}
