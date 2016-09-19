package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeHasGenreInverseIterator theAcademicDegreeHasGenreInverseIterator = (AcademicDegreeHasGenreInverseIterator)findAncestorWithClass(this, AcademicDegreeHasGenreInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

