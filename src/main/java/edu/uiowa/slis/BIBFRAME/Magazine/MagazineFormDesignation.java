package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineFormDesignationIterator theMagazine = (MagazineFormDesignationIterator)findAncestorWithClass(this, MagazineFormDesignationIterator.class);
			pageContext.getOut().print(theMagazine.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

