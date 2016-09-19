package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasDataSourceInverseIterator theIndexHasDataSourceInverseIterator = (IndexHasDataSourceInverseIterator)findAncestorWithClass(this, IndexHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theIndexHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

