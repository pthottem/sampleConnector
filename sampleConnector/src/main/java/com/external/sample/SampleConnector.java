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

public class SampleConnector  extends BaseConnectorSpecification
{

	 
	private static final long serialVersionUID = 1L;

	@Override
	public String displayName() {
	 
		return "SAMPLE";
	}

	@Override
	public String version() {
		 
		return "1.0";
	}

	@Override
	public Boolean test(Map<String, Object> configData, Map<String, Object> filterData) throws ConnectorException,
			InvalidCredentialException, InvalidAttributeValueException, OperationTimeoutException, MissingKeyException {
		//logic to test connection
		return true;
	}

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

	@Override
	public Boolean checkExisting(Map<String, Object> configData, Map<String, Object> data,
			SearchableObject serachableObject) throws ConnectorException {
		 
		Boolean recordFound=false;
		//Connect to target System With Config data 
		//Check in target System 
		//Return 
		return recordFound;
	}

	@Override
	public Boolean createAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		Boolean recordCreated=false;
		//Connect to target System With Config data 
		//Create in target System 
		//Return 
		return recordCreated;
	}

	@Override
	public Map<String, List<Map<String, Object>>> accountReconcile(Map<String, Object> configData,
			Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean lockAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean disableAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean unLockAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean enableAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer terminateAccount(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer removeAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addAccessToAccount(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer removeAccessToAccount(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean changePassword(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createUser(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateUser(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateEntitlement(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createEntitlement(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validateCredentials(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getSummary(Map<String, Object> configData, Map<String, Object> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConfig(ConfigDataVo configData) {
		// TODO Auto-generated method stub
		
	}
    
}
