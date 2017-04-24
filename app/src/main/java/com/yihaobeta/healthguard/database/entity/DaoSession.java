package com.yihaobeta.healthguard.database.entity;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yihaobeta.healthguard.database.entity.UniversalDetailEntity;

import com.yihaobeta.healthguard.database.entity.UniversalDetailEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig universalDetailEntityDaoConfig;

    private final UniversalDetailEntityDao universalDetailEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        universalDetailEntityDaoConfig = daoConfigMap.get(UniversalDetailEntityDao.class).clone();
        universalDetailEntityDaoConfig.initIdentityScope(type);

        universalDetailEntityDao = new UniversalDetailEntityDao(universalDetailEntityDaoConfig, this);

        registerDao(UniversalDetailEntity.class, universalDetailEntityDao);
    }
    
    public void clear() {
        universalDetailEntityDaoConfig.clearIdentityScope();
    }

    public UniversalDetailEntityDao getUniversalDetailEntityDao() {
        return universalDetailEntityDao;
    }

}