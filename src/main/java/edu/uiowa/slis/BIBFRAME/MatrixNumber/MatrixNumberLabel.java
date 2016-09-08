package edu.uiowa.slis.BIBFRAME.MatrixNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MatrixNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MatrixNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MatrixNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MatrixNumber theMatrixNumber = (MatrixNumber)findAncestorWithClass(this, MatrixNumber.class);
			if (!theMatrixNumber.commitNeeded) {
				pageContext.getOut().print(theMatrixNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MatrixNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MatrixNumber theMatrixNumber = (MatrixNumber)findAncestorWithClass(this, MatrixNumber.class);
			return theMatrixNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MatrixNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MatrixNumber theMatrixNumber = (MatrixNumber)findAncestorWithClass(this, MatrixNumber.class);
			theMatrixNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MatrixNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for label tag ");
		}
	}
}

