package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasDataSourceInverseIterator theIntegratingResourceHasDataSourceInverseIterator = (IntegratingResourceHasDataSourceInverseIterator)findAncestorWithClass(this, IntegratingResourceHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

