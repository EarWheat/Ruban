import React from 'react';
import {PageContainer} from '@ant-design/pro-layout';
import {Card} from 'antd';
import Footer from './components/Footer';
import ServiceItem from './components/ServiceItem';


export default (): React.ReactNode => (
  <PageContainer>
    <Card>
     <ServiceItem />
    </Card>
    <Footer />
  </PageContainer>
);
