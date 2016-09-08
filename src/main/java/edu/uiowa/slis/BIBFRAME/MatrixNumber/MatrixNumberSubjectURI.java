package edu.uiowa.slis.BIBFRAME.MatrixNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MatrixNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MatrixNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MatrixNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MatrixNumber theMatrixNumber = (MatrixNumber)findAncestorWithClass(this, MatrixNumber.class);
			if (!theMatrixNumber.commitNeeded) {
				pageContext.getOut().print(theMatrixNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MatrixNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MatrixNumber theMatrixNumber = (MatrixNumber)findAncestorWithClass(this, MatrixNumber.class);
			return theMatrixNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MatrixNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MatrixNumber theMatrixNumber = (MatrixNumber)findAncestorWithClass(this, MatrixNumber.class);
			theMatrixNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MatrixNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for subjectURI tag ");
		}
	}
}

