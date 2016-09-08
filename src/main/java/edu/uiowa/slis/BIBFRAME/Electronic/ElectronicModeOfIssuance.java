package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicModeOfIssuance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicModeOfIssuance currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicModeOfIssuance.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicModeOfIssuanceIterator theElectronic = (ElectronicModeOfIssuanceIterator)findAncestorWithClass(this, ElectronicModeOfIssuanceIterator.class);
			pageContext.getOut().print(theElectronic.getModeOfIssuance());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for modeOfIssuance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for modeOfIssuance tag ");
		}
		return SKIP_BODY;
	}
}

