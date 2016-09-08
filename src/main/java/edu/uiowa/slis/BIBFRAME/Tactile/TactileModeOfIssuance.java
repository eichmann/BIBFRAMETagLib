package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileModeOfIssuance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileModeOfIssuance currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileModeOfIssuance.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileModeOfIssuanceIterator theTactile = (TactileModeOfIssuanceIterator)findAncestorWithClass(this, TactileModeOfIssuanceIterator.class);
			pageContext.getOut().print(theTactile.getModeOfIssuance());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for modeOfIssuance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for modeOfIssuance tag ");
		}
		return SKIP_BODY;
	}
}

