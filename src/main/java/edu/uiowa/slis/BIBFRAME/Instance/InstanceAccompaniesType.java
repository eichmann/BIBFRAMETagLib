package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceAccompaniesIterator theInstanceAccompaniesIterator = (InstanceAccompaniesIterator)findAncestorWithClass(this, InstanceAccompaniesIterator.class);
			pageContext.getOut().print(theInstanceAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

