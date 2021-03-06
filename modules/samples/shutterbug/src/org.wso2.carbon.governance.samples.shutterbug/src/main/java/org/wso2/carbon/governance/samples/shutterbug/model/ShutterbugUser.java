/*
 *  Copyright (c) 2005-2009, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.governance.samples.shutterbug.model;

import java.util.List;
import java.util.LinkedList;

public class ShutterbugUser {

    private String id;
    private String userId;
    private List<ShutterbugImage> images = new LinkedList<ShutterbugImage>();

    public ShutterbugUser(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void addImage(ShutterbugImage image) {
        if (images.size() < 2) {
            images.add(image);
        }
    }

    public List<ShutterbugImage> getImages() {
        return images;
    }

    public void setImages(List<ShutterbugImage> images) {
        this.images = images;
    }
}
