package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MultipartMonograph theMultipartMonograph = (MultipartMonograph)findAncestorWithClass(this, MultipartMonograph.class);
			if (!theMultipartMonograph.commitNeeded) {
				pageContext.getOut().print(theMultipartMonograph.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MultipartMonograph theMultipartMonograph = (MultipartMonograph)findAncestorWithClass(this, MultipartMonograph.class);
			return theMultipartMonograph.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MultipartMonograph for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MultipartMonograph theMultipartMonograph = (MultipartMonograph)findAncestorWithClass(this, MultipartMonograph.class);
			theMultipartMonograph.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for label tag ");
		}
	}
}

