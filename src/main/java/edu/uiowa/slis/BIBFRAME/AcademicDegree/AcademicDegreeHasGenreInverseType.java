package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeHasGenreInverseIterator theAcademicDegreeHasGenreInverseIterator = (AcademicDegreeHasGenreInverseIterator)findAncestorWithClass(this, AcademicDegreeHasGenreInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

