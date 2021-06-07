/*
 * Copyright 2017-2021 Dromara.org

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.hmily.tac.sqlparser.model.common.segment.dml.order.item;

import lombok.Getter;
import lombok.ToString;
import org.dromara.hmily.tac.sqlparser.model.common.constant.HmilyOrderDirection;
import org.dromara.hmily.tac.sqlparser.model.common.segment.dml.column.HmilyColumnSegment;

/**
 * Order by item segment for column.
 */
@Getter
@ToString(callSuper = true)
public final class HmilyColumnOrderByItemSegment extends HmilyTextOrderByItemSegment {
    
    private final HmilyColumnSegment column;
    
    public HmilyColumnOrderByItemSegment(final HmilyColumnSegment column, final HmilyOrderDirection hmilyOrderDirection, final HmilyOrderDirection nullHmilyOrderDirection) {
        super(column.getStartIndex(), column.getStopIndex(), hmilyOrderDirection, nullHmilyOrderDirection);
        this.column = column;
    }
    
    public HmilyColumnOrderByItemSegment(final HmilyColumnSegment column, final HmilyOrderDirection hmilyOrderDirection) {
        super(column.getStartIndex(), column.getStopIndex(), hmilyOrderDirection, HmilyOrderDirection.ASC);
        this.column = column;
    }
    
    @Override
    public String getText() {
        return column.getQualifiedName();
    }
}
