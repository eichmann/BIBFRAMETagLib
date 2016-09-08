package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasDataSourceIterator theIndexHasDataSourceIterator = (IndexHasDataSourceIterator)findAncestorWithClass(this, IndexHasDataSourceIterator.class);
			pageContext.getOut().print(theIndexHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

