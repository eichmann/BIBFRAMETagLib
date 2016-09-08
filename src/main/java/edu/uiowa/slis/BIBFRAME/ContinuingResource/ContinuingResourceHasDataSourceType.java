package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasDataSourceIterator theContinuingResourceHasDataSourceIterator = (ContinuingResourceHasDataSourceIterator)findAncestorWithClass(this, ContinuingResourceHasDataSourceIterator.class);
			pageContext.getOut().print(theContinuingResourceHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

