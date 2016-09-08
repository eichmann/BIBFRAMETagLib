package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceModeOfIssuance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceModeOfIssuance currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceModeOfIssuance.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceModeOfIssuanceIterator theInstance = (InstanceModeOfIssuanceIterator)findAncestorWithClass(this, InstanceModeOfIssuanceIterator.class);
			pageContext.getOut().print(theInstance.getModeOfIssuance());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for modeOfIssuance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for modeOfIssuance tag ");
		}
		return SKIP_BODY;
	}
}

