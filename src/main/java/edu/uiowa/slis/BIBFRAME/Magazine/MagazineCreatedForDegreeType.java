package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineCreatedForDegreeIterator theMagazineCreatedForDegreeIterator = (MagazineCreatedForDegreeIterator)findAncestorWithClass(this, MagazineCreatedForDegreeIterator.class);
			pageContext.getOut().print(theMagazineCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

