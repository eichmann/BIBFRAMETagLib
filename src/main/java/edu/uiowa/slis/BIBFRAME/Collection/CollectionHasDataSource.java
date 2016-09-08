package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasDataSourceIterator theCollectionHasDataSourceIterator = (CollectionHasDataSourceIterator)findAncestorWithClass(this, CollectionHasDataSourceIterator.class);
			pageContext.getOut().print(theCollectionHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

