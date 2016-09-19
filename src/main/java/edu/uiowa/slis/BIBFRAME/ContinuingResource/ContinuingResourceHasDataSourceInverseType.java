package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasDataSourceInverseIterator theContinuingResourceHasDataSourceInverseIterator = (ContinuingResourceHasDataSourceInverseIterator)findAncestorWithClass(this, ContinuingResourceHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theContinuingResourceHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

