package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasDataSourceInverseIterator theIntegratingResourceHasDataSourceInverseIterator = (IntegratingResourceHasDataSourceInverseIterator)findAncestorWithClass(this, IntegratingResourceHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}
