package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSupersedesIterator theMagazineSupersedesIterator = (MagazineSupersedesIterator)findAncestorWithClass(this, MagazineSupersedesIterator.class);
			pageContext.getOut().print(theMagazineSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

