package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasDataSourceIterator theIntegratingResourceHasDataSourceIterator = (IntegratingResourceHasDataSourceIterator)findAncestorWithClass(this, IntegratingResourceHasDataSourceIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

