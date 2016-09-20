package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasFindingAidIterator theMagazineHasFindingAidIterator = (MagazineHasFindingAidIterator)findAncestorWithClass(this, MagazineHasFindingAidIterator.class);
			pageContext.getOut().print(theMagazineHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

