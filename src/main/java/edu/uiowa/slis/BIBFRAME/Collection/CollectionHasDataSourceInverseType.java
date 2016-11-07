package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasDataSourceInverseIterator theCollectionHasDataSourceInverseIterator = (CollectionHasDataSourceInverseIterator)findAncestorWithClass(this, CollectionHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theCollectionHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}
