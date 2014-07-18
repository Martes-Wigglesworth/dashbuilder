/**
 * Copyright (C) 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.dataset;

import org.dashbuilder.dataset.impl.DataSetBuilderImpl;
import org.dashbuilder.dataset.impl.DataSetImpl;
import org.dashbuilder.dataset.impl.DataSetLookupBuilderImpl;

/**
 * Factory class for building DataSet instances.
 */
public final class DataSetFactory {

    public static DataSet newDataSet() {
        return new DataSetImpl();
    }

    public static DataSetBuilder newDSBuilder() {
        return new DataSetBuilderImpl();
    }

    public static DataSetLookupBuilder newDSLookup() {
        return new DataSetLookupBuilderImpl();
    }
}