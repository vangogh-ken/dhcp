/*
 * Copyright 2009 Jagornet Technologies, LLC.  All Rights Reserved.
 *
 * This software is the proprietary information of Jagornet Technologies, LLC. 
 * Use is subject to license terms.
 *
 */

/*
 *   This file PoliciesDTO.java is part of DHCPv6.
 *
 *   DHCPv6 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   DHCPv6 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with DHCPv6.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.jagornet.dhcpv6.dto;

import java.io.Serializable;
import java.util.List;

/**
 * The Class PoliciesDTO.
 * 
 * @author A. Gregory Rabil
 */
public class PoliciesDTO implements Serializable
{	
	/**
	 * Default serial version id.
	 */
	private static final long serialVersionUID = 1L;
	
	/** The policy list. */
	protected List<PolicyDTO> policyList;

	/**
	 * Gets the policy list.
	 * 
	 * @return the policy list
	 */
	public List<PolicyDTO> getPolicyList() 
	{
		return policyList;
	}

	/**
	 * Gets the policy array.
	 * This method is here to satisfy Dozer mapping with
	 * code, instead of via the dozermap.xml file.
	 * 
	 * @return the policy array
	 */
	public PolicyDTO[] getPolicyArray() 
	{
		if (policyList != null)
			return policyList.toArray(new PolicyDTO[0]);
		
		return null;
	}
	
	/**
	 * Sets the policy list.
	 * 
	 * @param policyList the new policy list
	 */
	public void setPolicyList(List<PolicyDTO> policyList) 
	{
		this.policyList = policyList;
	}
	
}