package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineAgentInverseIterator theMagazineAgentInverseIterator = (MagazineAgentInverseIterator)findAncestorWithClass(this, MagazineAgentInverseIterator.class);
			pageContext.getOut().print(theMagazineAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for agent tag ");
		}
		return SKIP_BODY;
	}
}

