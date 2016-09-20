package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsFindingAidForIterator theMagazineIsFindingAidForIterator = (MagazineIsFindingAidForIterator)findAncestorWithClass(this, MagazineIsFindingAidForIterator.class);
			pageContext.getOut().print(theMagazineIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

