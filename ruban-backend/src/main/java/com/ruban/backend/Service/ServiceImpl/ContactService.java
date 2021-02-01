package com.ruban.backend.Service.ServiceImpl;

import com.ruban.backend.Entity.ContactInfo;
import com.ruban.backend.Entity.EmailExample;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-22 18:46
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
public interface ContactService {
    ContactInfo getContactInfo();
    EmailExample contactOrder(ContactInfo contactInfo);
}
