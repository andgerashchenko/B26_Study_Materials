(self.webpackChunklite=self.webpackChunklite||[]).push([[4270],{94270:(e,n,i)=>{"use strict";i.r(n),i.d(n,{PublicationThemingProvider:()=>s});var a=i(64718),l=i(67294),t=i(98096),d=i(31889),o=i(87879),m=i(3207),k=i(319),c=i.n(k),r=i(51894),u={kind:"Document",definitions:[{kind:"OperationDefinition",operation:"query",name:{kind:"Name",value:"PublicationThemingProviderQuery"},variableDefinitions:[{kind:"VariableDefinition",variable:{kind:"Variable",name:{kind:"Name",value:"domainOrSlug"}},type:{kind:"NonNullType",type:{kind:"NamedType",name:{kind:"Name",value:"ID"}}}}],selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",alias:{kind:"Name",value:"collection"},name:{kind:"Name",value:"collectionByDomainOrSlug"},arguments:[{kind:"Argument",name:{kind:"Name",value:"domainOrSlug"},value:{kind:"Variable",name:{kind:"Name",value:"domainOrSlug"}}}],selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"id"}},{kind:"FragmentSpread",name:{kind:"Name",value:"ThemingProvider_publisher"}}]}}]}}].concat(c()(r.CD.definitions))},s=function(e){var n=e.children,i=e.domainOrSlug,k=(0,d.F)(),c=(0,a.a)(u,{variables:{domainOrSlug:i}}),r=c.data,s=c.error;if(c.loading||s||null==r||!r.collection)return n;var S=r.collection,v=S.colorPalette,N=S.customStyleSheet,g=(0,m.zI)(N,k,v),F=(0,m.ZI)(N,g);return F.accentColor.fillTransparent.light=(0,o.JX)((0,o.n2)(F.accentColor.fill.light).slice(0,3).concat(.5)),l.createElement(t.f,{theme:F},n)}},51894:(e,n,i)=>{"use strict";i.d(n,{CD:()=>d});var a=i(319),l=i.n(a),t={kind:"Document",definitions:[{kind:"FragmentDefinition",name:{kind:"Name",value:"ThemingProvider_colorPalette"},typeCondition:{kind:"NamedType",name:{kind:"Name",value:"ColorPalette"}},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"highlightSpectrum"},selectionSet:{kind:"SelectionSet",selections:[{kind:"FragmentSpread",name:{kind:"Name",value:"ThemingProvider_colorSpectrum"}}]}},{kind:"Field",name:{kind:"Name",value:"defaultBackgroundSpectrum"},selectionSet:{kind:"SelectionSet",selections:[{kind:"FragmentSpread",name:{kind:"Name",value:"ThemingProvider_colorSpectrum"}}]}},{kind:"Field",name:{kind:"Name",value:"tintBackgroundSpectrum"},selectionSet:{kind:"SelectionSet",selections:[{kind:"FragmentSpread",name:{kind:"Name",value:"ThemingProvider_colorSpectrum"}}]}}]}}].concat(l()([{kind:"FragmentDefinition",name:{kind:"Name",value:"ThemingProvider_colorSpectrum"},typeCondition:{kind:"NamedType",name:{kind:"Name",value:"ColorSpectrum"}},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"backgroundColor"}},{kind:"Field",name:{kind:"Name",value:"colorPoints"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"color"}},{kind:"Field",name:{kind:"Name",value:"point"}}]}}]}}]))},d={kind:"Document",definitions:[{kind:"FragmentDefinition",name:{kind:"Name",value:"ThemingProvider_publisher"},typeCondition:{kind:"NamedType",name:{kind:"Name",value:"Publisher"}},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"__typename"}},{kind:"Field",name:{kind:"Name",value:"id"}},{kind:"Field",name:{kind:"Name",value:"customStyleSheet"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"id"}},{kind:"Field",name:{kind:"Name",value:"global"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"colorPalette"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"primary"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"colorPalette"},selectionSet:{kind:"SelectionSet",selections:[{kind:"FragmentSpread",name:{kind:"Name",value:"ThemingProvider_colorPalette"}}]}}]}},{kind:"Field",name:{kind:"Name",value:"background"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"rgb"}},{kind:"Field",name:{kind:"Name",value:"alpha"}},{kind:"Field",name:{kind:"Name",value:"colorPalette"},selectionSet:{kind:"SelectionSet",selections:[{kind:"FragmentSpread",name:{kind:"Name",value:"ThemingProvider_colorPalette"}}]}}]}}]}},{kind:"Field",name:{kind:"Name",value:"fonts"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"font1"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"name"}}]}},{kind:"Field",name:{kind:"Name",value:"font2"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"name"}}]}},{kind:"Field",name:{kind:"Name",value:"font3"},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"name"}}]}}]}}]}}]}},{kind:"InlineFragment",typeCondition:{kind:"NamedType",name:{kind:"Name",value:"Collection"}},selectionSet:{kind:"SelectionSet",selections:[{kind:"Field",name:{kind:"Name",value:"colorPalette"},selectionSet:{kind:"SelectionSet",selections:[{kind:"FragmentSpread",name:{kind:"Name",value:"ThemingProvider_colorPalette"}}]}}]}}]}}].concat(l()(t.definitions))}}}]);
//# sourceMappingURL=https://stats.medium.build/lite/sourcemaps/4270.c0f5b685.chunk.js.map