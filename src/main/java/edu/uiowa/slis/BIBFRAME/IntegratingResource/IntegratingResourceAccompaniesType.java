package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceAccompaniesIterator theIntegratingResourceAccompaniesIterator = (IntegratingResourceAccompaniesIterator)findAncestorWithClass(this, IntegratingResourceAccompaniesIterator.class);
			pageContext.getOut().print(theIntegratingResourceAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

