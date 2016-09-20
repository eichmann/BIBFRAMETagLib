package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasTitleIterator theMagazineHasTitleIterator = (MagazineHasTitleIterator)findAncestorWithClass(this, MagazineHasTitleIterator.class);
			pageContext.getOut().print(theMagazineHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

