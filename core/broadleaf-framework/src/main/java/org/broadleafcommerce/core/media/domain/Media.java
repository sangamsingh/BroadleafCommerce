/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.media.domain;

import java.io.Serializable;

public interface Media extends Serializable {
    public Long getId();

    public void setId(Long id);

    public String getName();

    public void setName(String name);

    public String getUrl();

    public void setUrl(String url);

    public String getLabel();

    public void setLabel(String label);
}
