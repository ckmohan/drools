/*
 * Copyright 2010 JBoss Inc
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

package org.drools.core.event.knowlegebase.impl;

import org.kie.KnowledgeBase;
import org.kie.definition.KnowledgePackage;
import org.kie.event.kiebase.AfterKiePackageRemovedEvent;

public class AfterKiePackageRemovedEventImpl extends KnowledgeBaseEventImpl implements AfterKiePackageRemovedEvent {
    private KnowledgePackage knowledgePackage;
    
    public AfterKiePackageRemovedEventImpl(KnowledgeBase knowledgeBase, KnowledgePackage knowledgePackage) {
        super( knowledgeBase );
        this.knowledgePackage = knowledgePackage;
    }

    public KnowledgePackage getKiePackage() {
        return this.knowledgePackage;
    }

    @Override
    public String toString() {
        return "==>[AfterKiePackageRemovedEventImpl: getKiePackage()=" + getKiePackage()
                + ", getKieBase()=" + getKieBase() + "]";
    }
    
}
