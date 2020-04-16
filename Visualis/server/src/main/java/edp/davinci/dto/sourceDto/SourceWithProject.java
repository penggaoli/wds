/*
 * <<
 *  Davinci
 *  ==
 *  Copyright (C) 2016 - 2019 EDP
 *  ==
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  >>
 *
 */

package edp.davinci.dto.sourceDto;

import edp.davinci.model.Project;
import edp.davinci.model.Source;
import lombok.Data;

@Data
public class SourceWithProject extends Source {

    private Project project;
    public void setSource(Source source){
        this.setId(source.getId());
        this.setConfig(source.getConfig());
        this.setName(source.getName());
        this.setDescription(source.getDescription());
        this.setProjectId(source.getProjectId());
        this.setType(source.getType());
    }
}