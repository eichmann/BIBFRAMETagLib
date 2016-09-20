package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineFollowsIterator theMagazineFollowsIterator = (MagazineFollowsIterator)findAncestorWithClass(this, MagazineFollowsIterator.class);
			pageContext.getOut().print(theMagazineFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for follows tag ");
		}
		return SKIP_BODY;
	}
}

